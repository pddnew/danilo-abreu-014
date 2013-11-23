<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> -->
<!-- <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script> -->
<script src="resources/jquery/jquery.min.js"></script>
<script src="resources/jquery/jquery-ui.js"></script>
<link href="resources/css/style.css" rel="stylesheet" type="text/css">
<link href="resources/css/carousel.css" rel="stylesheet" type="text/css">
<link href="resources/css/aging.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="resources/js/webtest.js"></script>
<script type="text/javascript" src="resources/js/carousel.js"></script>
<script type="text/javascript" src="resources/js/aging.js"></script>
<script type="text/javascript" src="resources/js/loadeffects.js"></script>

<title></title>
</head>
<body>
<fmt:setBundle basename="edu.pddnew.test.messages.messages"/>
<div id="mask"></div>
<div id="loader"></div>
<div id="menu">
<ul>
	<li><a href="lang.do?lang=en_US"><fmt:message key="lang.english"/> </a></li>
	<li><a href="lang.do?lang=pt"><fmt:message key="lang.portuguese"/> </a></li>
	<li><a href="lang.do?lang=es"><fmt:message key="lang.spanish"/> </a></li>
	<li><a href="lang.do?lang=ko"><fmt:message key="lang.korea"/> </a></li>
</ul>
</div>
<h1><fmt:message key="index.defaultMessage"/> </h1>
<hr/>
<div id="errorMsg" style="display: none;">
	<strong><fmt:message  key="user.error"/></strong>
</div>
<div id="userData">
	<strong><fmt:message key="user.name"/>:&nbsp;</strong>
		<span id="userName"></span>
	<strong><fmt:message key="user.age"/>:&nbsp;</strong>
		<span id="userAge"></span>
	<br/>
	<strong><fmt:message key="user.phones"/>:&nbsp;</strong>
	<label id="lblCell" class="phone"><fmt:message key="user.cell"/>:&nbsp;</label>
			<span id="cell" class="phone"></span>&nbsp;
	<label id="lblHome" class="phone"><fmt:message key="user.home"/>:&nbsp;</label>			
			<span id="home" class="phone"></span>&nbsp;
	<label id="lblOffice" class="phone"><fmt:message key="user.office"/>:&nbsp;</label>			
			<span id="office" class="phone"></span>&nbsp;
</div>
<hr/>
<c:set var="now" value="<%= new Date() %>"/>
<h4><fmt:formatDate type="both" value="${now }"/> </h4>
<div>
<fmt:message key="index.reference"/>:&nbsp;<small>http://www.tutorialspoint.com/jsp/jstl_format_formatdate_tag.htm</small> 
</div>
<hr/>
<c:set var="balance" value="125678.98" />
<c:set var="target" value="14.26" />
<c:set var="start" value="21.32" />
<div><fmt:formatNumber type="currency" value="${balance }"/></div>
<div><fmt:formatNumber type="number" value="${target }"/></div>
<div><fmt:formatNumber type="percent" value="${start }"/></div>
<div>
<fmt:message key="index.reference"/>:&nbsp;<small>http://www.tutorialspoint.com/jsp/jstl_format_formatdate_tag.htm</small>
</div>
<hr/>
<div id="countTotal"></div>
<div id="carousel"></div>
<hr/>
<div id="aging"></div>
<div>
<fmt:message key="index.reference"/>:&nbsp;<small>http://ayp-sd.blogspot.com.br/2012/12/joda-time-tutorial_7.html</small>
</div>
</body>
</html>