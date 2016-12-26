<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=utf-8" %>
<html>
<head>
    <title>World Express</title>

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
                        <a href="#" class="active">
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
                <div  class="start-page">
                    <div class="start-page-text">
                        <h1>WorldExpress</h1>
                        <p>Путешествуй вместе с нами!</p>
                    </div>
                    <img src="<c:url value="/resource/img/1.jpg" />" alt="" />
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <a href="<c:url value="/tours"/>" class="panel-href">
                            <div class="panel card tour-card start">
                                <div class="panel-heading">
                                    <div class="img-section">
                                        <img src="<c:url value="/resource/img/rio.jpg" />">
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <h2>Самые незабываемые путешествия</h2>
                                    <h4>Только у нас</h4>
                                    <p class="link">Просмотреть туры &#8614;</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4">
                        <a href="<c:url value="/news"/>" class="panel-href">
                            <div class="panel card tour-card start">
                                <div class="panel-heading">
                                    <div class="img-section">
                                        <img src="<c:url value="/resource/img/olimp_news.jpg" />">
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <h2>Свежие новости</h2>
                                    <h4>Узнай всё о мире вокруг</h4>
                                    <p class="link">Просмотреть туры &#8614;</p>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="col-lg-4">
                        <a href="<c:url value="/hottours"/>" class="panel-href">
                            <div class="panel card tour-card start">
                                <div class="panel-heading">
                                    <div class="img-section">
                                        <img src="<c:url value="/resource/img/rio2.jpg" />">
                                    </div>
                                </div>
                                <div class="panel-body">
                                    <h2>Не пропусти Горящие туры</h2>
                                    <h4>Дешевле некуда!</h4>
                                    <p class="link">Просмотреть туры &#8614;</p>
                                </div>
                            </div>
                        </a>
                    </div>
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