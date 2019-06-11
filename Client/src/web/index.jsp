
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="urlPath" value="${requestScope['javax.servlet.forward.request_uri']}"/>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">


    <title>Hiring history</title>

    <!-- Custom styles for this template -->
    <link href="web/WEB-INF/resources/cover.css" rel="stylesheet">

    <!--JS-->
    <script  src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="   crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <!--CSS-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="inner cover">

                <div class="wrapper  <c:if test="${param.error !=true}">fadeInDown </c:if>">
                    <div id="formContent">
                        <!-- Tabs Titles -->
                        <!-- Icon -->
                        <div class="<c:if test="${param.error !=true}">fadeIn first </c:if> ">
                            <br>
                            <h1 class="cover-heading">Hiring history</h1>
                            <p class="lead">Login to see information</p> <p class="lead">
                        </div>
                        <!-- Login Form -->
                        <form action="Login" method="post">
                            <input type="text" id="login fadeIn second " name="login" placeholder="login" value="${login}">
                            <input type="text" id="password fadeIn third"   name="password" placeholder="password">
                            <input type="submit" class="btn-success fadeIn fourth"   value="Log In">
                        </form>


                        <div id="formFooter">
                            <p class="underlineHover">${s}</p>

                        </div>

                    </div>
                </div>

                </p>
            </div>

            <div class="mastfoot">
            </div>

        </div>

    </div>

</div>

</body>
</html>