<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <link rel=stylesheet type="text/css" href="./style.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <!--Basic settings above-->

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Search </title>
</head>
<body>
        <!--Input Section-->
        <div class="input title-center">
            <center><p class="section-title">Film Search+</p></center>
            <form action="/Final_Project/GoogleResult.jsp" method='post'>
                <div class="input-group">
                    <span class="input-group-text" id="addon-wrapping">Title</span>
                    <input type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="addon-wrapping">
                    <input class="btn btn-secondary" type="submit" value="Search">
                </div>
            </form>
        </div>
    </body>
</html>