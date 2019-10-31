<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version = "1.0"
				xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match ="/">
		<HTML>
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
				<title>Пример веб-страницы</title>
			</head>
			<BODY>
				<xsl:apply-templates select="root"/>
				<xsl:apply-templates select="root/step"/>
			</BODY>
		</HTML>
	</xsl:template>

	<xsl:template match="root">
		<H3>
		Тнма: <xsl:value-of select="@name"/> Подтема: <xsl:value-of select="@theme"/> Количнство вопросов: <xsl:value-of
			select="@countQuestions"/> Отведенное время на тест: <xsl:value-of select="@time"/> Количестов баллов: <xsl:value-of
			select="@allPoints"/>
		</H3>

	</xsl:template>

	<xsl:template match="step">
		<p>Вопрос № <xsl:value-of select="@name"/>. Cтоимость вопроса: <xsl:value-of select="@points"/>. Выделенное время на ответ: <xsl:value-of select="@time"/>  секунд. Слодность вопроса:<xsl:value-of select="@difficulty"/></p>
		<xsl:value-of select="text()"/>
		<form>
				<xsl:apply-templates select="answer"/>
		</form>
	</xsl:template>

	<xsl:template match="answer">
		<input type="radio">
			<xsl:attribute name="name"><xsl:value-of select="../@name"/></xsl:attribute>
			<xsl:attribute name="value"><xsl:value-of select="@cost"/></xsl:attribute>
            <xsl:attribute name="id"><xsl:value-of select="@name"/></xsl:attribute>
		</input>
            <xsl:value-of select="text()"/>
		<br/>
	</xsl:template>

</xsl:stylesheet>