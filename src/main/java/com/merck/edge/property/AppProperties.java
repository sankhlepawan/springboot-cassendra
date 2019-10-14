package com.merck.edge.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppProperties {

	private boolean isProd;
	private String prodHost;
	private String uiHost;
	private String serverHost;
	private String domain;
	
}
