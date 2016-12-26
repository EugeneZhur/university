<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html lang="en/ru">
<head>
    <title>World Express - Our Tours</title>

    <link rel="stylesheet" href="<c:url value="/resource/main.css" />" />
    <script src="<c:url value="/resource/js/lib/jquery-1.12.0.min.js" />" type="text/javascript"></script>
    <link rel="stylesheet" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css" />" />
    <script src="<c:url value="/resource/bootstrap/js/bootstrap.min.js" />"></script>
    <script src="<c:url value ="/resource/js/uui-core.min.js" />" type="text/javascript"></script>
    <link rel="stylesheet" href="<c:url value="/resource/css/uui-all.css" />" />
    <link rel="stylesheet" href="<c:url value="/resource/css/lib/components/jquery.mCustomScrollbar.min.css"/>" />
    <script src="<c:url value="/resource/js/lib/components/jquery.mCustomScrollbar.concat.min.js"/>" ></script>
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
                        <a href="<c:url value="/news"/>">
                            <span>Новости</span>
                        </a>
                    </li>
                    <li>
                        <a href="#"  class="active">
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
                    <div class="title-cont-header col-lg-6">
                        <h1>Наши туры</h1>
                    </div>
                    <div class="filter-country col-lg-6">
                        <div class="uui-dropdown-button">
                            <button type="button" class="uui-button dropdown-toggle right-icon" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Сортировать
                                <i class="fa fa-angle-down"></i>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a href="/tours">По умолчанию</a></li>
                                <li><a href="/tours/sort">Сперва дешевые</a></li>
                                <li><a href="/tours/sortd">Сперва дорогие</a></li>
                            </ul>
                        </div>
                        <div class="uui-dropdown-button">
                            <button type="button" class="uui-button dropdown-toggle right-icon" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Выбрать страну
                                <i class="fa fa-angle-down"></i>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a href="/tours">Все страны</a></li>
                                <li><a href="/tours/турция">Турция</a></li>
                                <li><a href="/tours/египет">Египет</a></li>
                                <li><a href="/tours/бразилия">Бразилия</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <c:forEach items="${listTours}" var="tour">
                    <div class="col-lg-4">
                        <a href="/tour/${tour.id}" class="panel-href">
                            <div class="panel card tour-card ">
                                <div class="panel-heading">
                                    <div class="img-section">
                                        <img src="${tour.img}">
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <h2>${tour.city}</h2>
                                    <h4>${tour.country}</h4>
                                    <p>${tour.duration}</p>
                                    <p>${tour.way}</p>
                                    <p>${tour.food}</p>
                                </div>
                                <div class="panel-footer">
                                    <h4>Цена от ${tour.price} BYN</h4>
                                </div>
                            </div>
                        </a>
                    </div>
                    </c:forEach>
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
