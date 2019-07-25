<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="register.obj" method="post">
First Name:<f:input path="firstName"/>
Last Name:<f:input path="lastName"/>
e mail:<f:input path="email"/>
Gender:
<f:radiobutton path="gender" value="M" label="M"/>
<f:radiobutton path="gender" value="F" label="F"/>
Select Skill:
<f:checkbox path="skillSet" value="java" label="Java"/>
<f:checkbox path="skillSet" value="struct" label="Java"/>
<f:checkbox path="skillSet" value="spring" label="Java"/>
<f:checkbox path="skillSet" value="Hibernate" label="Hibernate"/>

Select city:
<f:select path="city">
<f:option value="blr" label="Bangalore"></f:option>

<f:option value="mys" label="Mysore"></f:option>

<f:option value="ap" label="Andhra"></f:option>
</f:select>

<input type="submit" value="Submit">



</f:form>

</body>
</html>