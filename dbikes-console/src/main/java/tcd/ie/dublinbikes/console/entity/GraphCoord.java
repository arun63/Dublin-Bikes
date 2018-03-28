package tcd.ie.dublinbikes.console.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author arun
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GraphCoord {
	
	@JsonProperty("x")
	private String x;
	
	@JsonProperty("y")
	private String y;
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	
}
