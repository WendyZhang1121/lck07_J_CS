

//Immutable WebRequest
public final class WebRequest {
	private final long bandwidth; private final long responseTime;
	public WebRequest(long bandwidth, long responseTime) { 
		this.bandwidth = bandwidth;
		this.responseTime = responseTime;
	}
	public long getBandwidth() { 
		return bandwidth;
	}

	public long getResponseTime() { 
		return responseTime;
	} 
}
