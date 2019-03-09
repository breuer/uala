package uala;

public class Channel {

	private CommunicationChannel communicationChannel;
	private String name;
	private boolean activate = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}

	public CommunicationChannel getCommunicationChannel() {
		return communicationChannel;
	}

	public void setCommunicationChannel(CommunicationChannel communicationChannel) {
		this.communicationChannel = communicationChannel;
	}
}
