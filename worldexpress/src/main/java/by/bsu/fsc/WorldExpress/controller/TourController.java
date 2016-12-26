package by.bsu.fsc.WorldExpress.controller;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import by.bsu.fsc.WorldExpress.model.User;
import by.bsu.fsc.WorldExpress.service.HotTourService;
import by.bsu.fsc.WorldExpress.service.HotelService;
import by.bsu.fsc.WorldExpress.service.NewsService;
import by.bsu.fsc.WorldExpress.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TourController {
    private TourService tourService;
    private HotelService hotelService;
    private HotTourService hotTourService;
    private NewsService newsService;

    @Autowired(required = true)
    @Qualifier(value = "hotelService")
    public void setHotelService(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @Autowired(required = true)
    @Qualifier(value = "tourService")
    public void setTourService(TourService tourService) {
        this.tourService = tourService;
    }

    @Autowired(required = true)
    @Qualifier(value = "newsService")
    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }

    @Autowired(required = true)
    @Qualifier(value = "hotTourService")
    public void setHotTourService(HotTourService hotTourService) {
        this.hotTourService = hotTourService;
    }

    @RequestMapping(value = "tours", method = RequestMethod.GET)
    public String listTours(Model model) {
        model.addAttribute("listTours", this.tourService.listTours());

        return "tours";
    }

    @RequestMapping(value = "news", method = RequestMethod.GET)
    public String listNews(Model model) {
        model.addAttribute("listNews", this.newsService.listNews());

        return "news";
    }

    @RequestMapping(value = "hottours", method = RequestMethod.GET)
    public String listHotTours(Model model) {
        model.addAttribute("listTours", this.hotTourService.listTours());

        return "hottours";
    }

    @RequestMapping(value = "tours/sort", method = RequestMethod.GET)
    public String sortTours(Model model) {
        model.addAttribute("listTours", this.tourService.sortByPrice());

        return "tours";
    }

    @RequestMapping(value = "hottours/sort", method = RequestMethod.GET)
    public String sortHotTours(Model model) {
        model.addAttribute("listTours", this.hotTourService.sortByPrice());

        return "hottours";
    }

    @RequestMapping(value = "tours/sortd", method = RequestMethod.GET)
    public String sortToursD(Model model) {
        model.addAttribute("listTours", this.tourService.sortByPriceD());

        return "tours";
    }

    @RequestMapping(value = "hottours/sortd", method = RequestMethod.GET)
    public String sortHotToursD(Model model) {
        model.addAttribute("listTours", this.hotTourService.sortByPriceD());

        return "hottours";
    }

    @RequestMapping(value = "/tours/{country}", method = RequestMethod.GET)
    public String filterTours(@PathVariable("country") String country, Model model) {
        model.addAttribute("listTours", this.tourService.filterByCountry(country));

        return "tours";
    }

    @RequestMapping("/tour/{id}")
    public String tourInfo(@PathVariable("id") int id,  Model model) {
        model.addAttribute("tour", this.tourService.getTourById(id));
        model.addAttribute("hotels", this.hotelService.getHotelByTourId(id));
        model.addAttribute("user", new User());

        return "tour";
    }

    @RequestMapping("/hottour/{id}")
    public String hotTourInfo(@PathVariable("id") int id,  Model model) {
        model.addAttribute("tour", this.hotTourService.getTourById(id));
        model.addAttribute("hotels", this.hotelService.getHotelByTourId(id));
        model.addAttribute("user", new User());

        return "hottour";
    }

    @RequestMapping(value = "/tour/{id}/mail", method = RequestMethod.POST)
    public String sendMail(@ModelAttribute("user") User user, @PathVariable("id") int id) {

        /** for mail **/
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        // Get a Properties object
        Properties props = System.getProperties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.store.protocol", "pop3");
        props.put("mail.transport.protocol", "smtp");
        final String username = "zhurzhenya@gmail.com";//
        final String password = "Abcd_9876";
        try{
            Session session = Session.getDefaultInstance(props,
                    new Authenticator(){
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }});

            // -- Create a new message --
            Message msg = new MimeMessage(session);

            // -- Set the FROM and TO fields --
            msg.setFrom(new InternetAddress("zhurzhenya@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("zhurzhenya@gmail.com", false));
            msg.setSubject("WorldExpress: Заказ разговора с менеджером");
            msg.setText(user.toString() + "\n--------------------\n" + this.tourService.getTourById(id).toString());
            msg.setSentDate(new Date());
            Transport.send(msg);
            System.out.println("Message sent.");
        }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
        /** for mail **/

        return "redirect:/tour/{id}";
    }
}
