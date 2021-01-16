<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel=stylesheet type="text/css" href="{{ url_for('static', filename='style.css') }}">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <!--Basic settings above-->

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

    </head>
    
    <body>
        <center>
        <!--Display Section-->
        <div class="results">
            <p class='section-title'>Basic Information</p>
                <table class="basic_info">
                    <tr>
                        <td class="info_cell" style="text-align: right;">Director:</td>
                        <td style="text-align: left;"><%request.getAttribute("query"); %></td>
                    </tr>
                    <tr>
                        <td class="info_cell" style="text-align: right;">Writers:</td>
                        <td style="text-align: left;">{{ binfo[1][1] }}</td>
                    </tr>
                    <tr>
                        <td class="info_cell" style="text-align: right;"></td>
                        <td style="text-align: left;">{{ binfo[1][2] }}</td>
                    </tr>
                    <tr>
                        <td class="info_cell" style="text-align: right;">Actors:</td>
                        <td style="text-align: left;">{{ binfo[2][1] }}</td>
                    </tr>
                    <tr>
                        <td class="info_cell" style="text-align: right;"></td>
                        <td style="text-align: left;">{{ binfo[2][2] }}</td>
                    </tr>
                    <tr>
                        <td class="info_cell" style="text-align: right;"></td>
                        <td style="text-align: left;">{{ binfo[2][3] }}</td>
                    </tr>
                </table>
                <br>
            <p class='section-title'>Recommended Results</p>
        <!--This part needs to be modified with backend codes-->
            <div class="result_panel" name="result_panel">
                {% for entry in data %}
                    <div class="result_block" onclick="location.href='{{ entry[3] }}';">
                        <b>{{ entry[1] }}</b><br>
                        <i>{{ entry[2] }}</i>
                    </div>
                {% endfor %}
            </div>
        </div>
        </center>
    </body>
</html>