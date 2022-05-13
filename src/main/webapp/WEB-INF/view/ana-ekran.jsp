<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Uye Giris Sayfasi</title>

    <style>
        body{
            background-image: url("https://devbeep.com/wp-content/uploads/2021/08/hhh-1.png");
        }
        h1,label{
            color:azure;
        }

        .error{
            color:red;
        }
    </style>
</head>
<body>
<h1>Giris Ekrani</h1>

<div class="container" >

    <form:form action="girisEkrani" modelAttribute="uyeGiris" method="POST">
        <table>
            <tbody >
            <tr>
                <td><label>Kullanici adi:</label></td>
                <td><form:input path="isim" /> </td>
                <td> <form:errors path="isim" cssClass="error"/></td>
            </tr>

            <tr>
                <td><label>Sifre(Tel):</label></td>
                <td><form:password path="telefon" /></td>
                <td><form:errors path="telefon" cssClass="error"/></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Giris"></td>
            </tr>
            </tbody>
        </table>
    </form:form>

</div>

</body>
</html>
