package bftsmart.tom.util;

/**
 * @author robin
 */
public class ExtractedResponse {
	private final int viewID;
	private final byte[] content;

	public ExtractedResponse(int viewID, byte[] content) {
		this.viewID = viewID;
		this.content = content;
	}

	public int getViewID() {
		return viewID;
	}

	public byte[] getContent() {
		return content;
	}
}
