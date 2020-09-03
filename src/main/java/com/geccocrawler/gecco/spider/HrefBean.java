package com.geccocrawler.gecco.spider;

import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;

public class HrefBean implements SpiderBean {

	private static final long serialVersionUID = -3770871271092767593L;

	@Href
	@HtmlField(cssPath="a")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
