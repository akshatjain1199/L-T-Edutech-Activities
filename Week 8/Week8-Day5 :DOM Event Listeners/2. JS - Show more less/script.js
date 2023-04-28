function read() {
	/Enter your text here/
	var anc=document.getElementById("content");
	var anchor=document.getElementById("anchor");
	if(anchor.innerHTML==="more")
	{
		anc.innerHTML="<p>A wedding planner is a professional who assists with the design, planning and management of a client's wedding. Weddings are significant events in people's lives and as such, couples are often willing to spend considerable amount of money to ensure that their weddings are well-organized. Wedding planners are often used by couples who work long hours and have little spare time available for sourcing and managing wedding venues and wedding suppliers.<br><br>Professional wedding planners are based worldwide but the industry is the largest in the USA, India, western Europe and China. Various wedding planning courses are available to those who wish to pursue the career. Planners generally charge either a percentage of the total wedding cost, or a flat fee.<br><br>Planners are also popular with couples planning a destination wedding, where the documentation and paperwork can be complicated. Any country where a wedding is held requires different procedures depending on the nationality of each the bride and the groom. For instance, US citizens marrying in Italy require a Nulla Osta (affidavit sworn in front of the US consulate in Italy), plus an Atto Notorio (sworn in front of the Italian consulate in the US or at a court in Italy), and legalization of the above. Some countries instead have agreements and the couple can get their No Impediment forms from their local registrar and have it translated by the consulate in the country of the wedding. A local wedding planner can take care of the different procedures.</p>";
		anchor.innerHTML="less";
	}
	else{
		anc.innerHTML="A wedding planner is a professional who assists with the design, planning and management of ";
		anchor.innerHTML="more";
	}
}
