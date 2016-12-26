<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=utf-8" %>

<html>
<head>
    <title>World Express - Our Tours</title>

    <script src="<c:url value="/resource/js/lib/jquery-1.12.0.min.js" />" type="text/javascript"></script>
    <link rel="stylesheet" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css" />" />
    <script src="<c:url value="/resource/bootstrap/js/bootstrap.min.js" />"></script>
    <script src="<c:url value ="/resource/js/uui-core.min.js" />" type="text/javascript"></script>
    <link rel="stylesheet" href="<c:url value="/resource/css/uui-all.css" />" />
    <link rel="stylesheet" href="<c:url value="/resource/css/lib/components/jquery.mCustomScrollbar.min.css"/>" />
    <script src="<c:url value="/resource/js/lib/components/jquery.mCustomScrollbar.concat.min.js"/>" ></script>
    <link rel="stylesheet" href="<c:url value="/resource/main.css" />" />
</head>
<body>
    <div class="wrapper">
        <header>
            <div class="uui-header sidebar-header">
                <nav>
                    <div class="uui-toggle-box">
                        <span></span>
                        <span></span>
                        <span></span>
                    </div>
                    <a href="#" class="brand-logo">
                        World express
                    </a>
                </nav>
            </div>
        </header>
        <aside>
            <div class="uui-side-bar">
                <ul class="sidebar-menu">
                    <li>
                        <a href="../../index.jsp">
                            <span>Главная</span>
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="/news"/>">
                            <span>Новости</span>
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="/tours"/>">
                            <span>Наши туры</span>
                        </a>
                    </li>
                    <li>
                        <a href="<c:url value="/hottours"/>">
                            <span>Горящие туры</span>
                        </a>
                    </li>
                </ul>
            </div>
        </aside>
        <div class="uui-main-container">
            <main>
                <article>
                    <div class="main-heading row">
                        <div class="image-panel col-lg-6">
                            <img src="${tour.img}" class="tour-image">
                        </div>
                        <div class="text-panel col-lg-6">
                            <h1>${tour.city}</h1>
                            <h4>${tour.country}</h4>
                            <p><b>Продолжительность тура:</b> ${tour.duration}</p>
                            <p><b>Точка отправления:</b> ${tour.way}</p>
                            <p><b>Тип питания:</b> ${tour.food}</p>
                            <button class="uui-button lime-green to-bottom buy-tour">приобрести тур</button>
                        </div>
                    </div>
                </article>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel card hotel">
                            <h2>Отель: ${hotels.get(0).name}</h2>
                            <p>${hotels.get(0).descr}</p>
                            <b>Расположение:</b>
                            <p>${hotels.get(0).location}</p>
                            <b>Количество комнат:</b>
                            <p>${hotels.get(0).rooms}</p>
                            <b>Описание комнат:</b>
                            <p>${hotels.get(0).r_descr}</p>
                            <b>Питание:</b>
                            <p>${hotels.get(0).food}</p>
                            <c:if test="${!empty hotels.get(0).beach}">
                                <b>Пляж:</b>
                                <p>${hotels.get(0).beach}</p>
                            </c:if>
                            <b>Развлечения и спорт:</b>
                            <p>${hotels.get(0).ent}</p>
                            <b>Инфраструктура:</b>
                            <p>${hotels.get(0).infr}</p>
                            <c:if test="${!empty hotels.get(0).for_child}">
                                <b>Для детей:</b>
                                <p>${hotels.get(0).for_child}</p>
                            </c:if>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel card hotel user-card">
                            <h2>Приобретение тура</h2>
                            <p>Стоимость тура может изменяться в зависимости от выбора номера, типа питания, акций в аэропорту и многих других факторов.
                                Для того, чтобы узнать точную стоимость тура и приобрести его а Нашем турагенстве, закажите, пожалуйста,
                                БЕСПЛАТНЫЙ звонок для разговора с менеджером.</p>

                            <div>
                                <c:url var="mailAction" value="/tour/${tour.id}/mail"/>
                                <form:form action="${mailAction}" commandName="user" cssClass="user-form">
                                <table class="user-table">
                                    <tr>
                                        <td>
                                            <h5>Заполните поля</h5>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <form:input path="name" cssClass="uui-form-element name-input" placeholder="Ваше имя"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <form:input path="number" cssClass="uui-form-element" placeholder="Ваш номер (+375** *** ** **)"/>
                                        </td>
                                    </tr>
                                </table>
                                <div style="background: #ffffff; width: 143px; height: 36px;" data-toggle="tooltip" data-placement="right" title="Перепроверьте, пожалуйста, введенные данные. От этого зависит сможет ли менеджер с Вами связаться.">
                                    <button class="uui-button lime-green" data-toggle="modal" data-target="#popup1" type="submit">Заказать звонок</button>
                                </div>
                                </form:form>
                            </div>
                            <!-- Modal -->
                            <div class="modal uui-modal fade" id="popup1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h4 class="modal-title">Заказ принят</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span></span><span></span></button>
                                        </div>
                                        <div class="modal-body">
                                            Наш менеджер перезвонит вам в течении 15 минут.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </div>
    <script>
        UUI.Sidebar.init( {open: true} );
        UUI.Navigation.init();

        $(function () {
            $('[data-toggle="tooltip"]').tooltip()
        })

        $('.to-bottom').click(function(){
            $('html, body').animate({scrollTop: $(document).height()}, 500);
        });
    </script>
</body>
</html>