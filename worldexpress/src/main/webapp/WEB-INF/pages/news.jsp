<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html lang="en/ru">
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
                <a href="../../index.jsp" class="brand-logo">
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
                    <a href="#" class="active">
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
            <div class="tour-cont-header row">
                <div class="title-cont-header col-lg-12">
                    <h1 class="test">Новости</h1>
                </div>
            </div>
            <div class="row">
                <section class="uui-accordion cards-accordion" id="accordion1">
                    <c:forEach items="${listNews}" var="news">
                        <div class="panel accordion-item">
                            <div class="accordion-heading">
                                <p class="accordion-title">
                                    <a data-toggle="collapse" data-parent="#accordion1" class="accordion-toggle" href="#${news.id}">
                                        <div class="news-block">
                                            <div class="news-heading">
                                                <div class="news-img-section">
                                                    <img src="${news.img}">
                                                </div>
                                            </div>
                                            <div class="news-body">
                                                <h2>${news.title}</h2>
                                                <h5>${news.date}</h5>
                                            </div>
                                        </div>
                                    </a>
                                </p>
                            </div>
                            <div class="accordion-collapse collapse" id="${news.id}">
                                <div class="accordion-body">
                                    <p>${news.cont}</p>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </section>
            </div>
        </main>
    </div>
</div>
<script>
    UUI.Sidebar.init( {open: true} );
    UUI.Navigation.init();
</script>
</body>
</html>
