<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Uye Guncelleme</title>
</head>
<body>
<h2>Uye Guncelleme Sayfası</h2>

    <form:form action="uyeGuncelle" modelAttribute="uye" method="POST">
        <form:hidden path="id"/>
        <table>
            <tbody>
        <tr>
            <td><label>isim: </label></td>
            <td><form:input path="isim" /></td>
        </tr>
        <tr>
            <td><label>soyisim: </label></td>
            <td><form:input path="soyisim" /></td>
        </tr>

        <tr>
            <td><label>Dogum Gunu: </label></td>
            <td><form:input path="dogumgunu" /></td>
        </tr>

        <tr>
            <td><label>Telefon: </label></td>
            <td><form:input path="telefon" /></td>
        </tr>

        <tr>
            <td><label></label></td>
            <td> <input type="submit" value="Guncelle"></td>
        </tr>

            </tbody>
        </table>

    </form:form>

</body>
</html>
