<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Uye Listesi Sayfası</title>

    <style>
        table,th,td{
            border:1px solid black;
            padding: 5px;
            background-color:yellow;
        }

        h2{
            border: 1px solid grey;
            border-radius: 15px;
            padding: 10px;
            background: aqua;
            margin-top: 0.83em;
            margin-bottom: 0.83em;
            margin-right: 70%;
            text-align: center;
        }


        .container{
            margin-top:5%;
        }
    </style>


</head>
<body>

  <h2>Uye Listesi</h2>
  <br><br>

   <form:form  action="uyeAra" method="GET">
    Uye Ara: <input type="text" name="aramaMetni">
       <input type="submit" value="Ara" />

   </form:form>


  <input type="button" value="Uye Ekle" onclick="window.location.href='uyeEkle'; return false;"/>



  <div class="container">
    <table>
        <tr>
            <th>isim</th>
            <th>soyisim</th>
            <th>dogumgunu</th>
            <th>telefon</th>
            <th>Update/Delete</th>
        </tr>

        <c:forEach var="uye" items="${uyeler}">

            <c:url var="silmeLinki" value="/menu/sil">
                <c:param name="uyeId" value="${uye.id}" />
            </c:url>

            <c:url var="guncellemeLinki" value="/menu/guncelle">
                <c:param name="uyeId" value="${uye.id}"/>
            </c:url>
            <tr>
                <td>${uye.isim}</td>
                <td>${uye.soyisim}</td>
                <td>${uye.dogumgunu}</td>
                <td>${uye.telefon}</td>
                <td>
                    <a href="${guncellemeLinki}">Guncelle</a>
                    |
                    <a href="${silmeLinki}" onclick="if (!(confirm('Silmek icin emin misiniz?'))) return false">Sil</a></td>
            </tr>


        </c:forEach>



        </tr>


    </table>
  </div>


</body>
</html>
