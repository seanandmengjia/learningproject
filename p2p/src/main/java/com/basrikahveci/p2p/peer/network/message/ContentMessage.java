package com.basrikahveci.p2p.peer.network.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.basrikahveci.p2p.peer.Peer;
import com.basrikahveci.p2p.peer.network.Connection;

public class ContentMessage implements Message {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContentMessage.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 4418182372368084371L;

	private final String msg;

	public ContentMessage(String msg) {
		this.msg = msg;
	}

	@Override
	public void handle(Peer peer, Connection connection) {
		LOGGER.debug("received {} from {}", msg, connection);
	}

	public String getMsg() {
		return msg;
	}

	@Override
    public String toString() {
        return "ContentMessage {" +
				"msg=" + this.msg + "}";
    }
}
