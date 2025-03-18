public class SystemUnit{

	private String cpuName;
	private int ramSize;
	private int diskSize;
	private String systemId;
	private String lcdModel;
	private int idCounter=0;

	SystemUnit(String cpuName,int ramSize,int diskSize,String systemId,String lcdModel){

		this.cpuName=cpuName;
		this.ramSize=ramSize;
		this.diskSize=diskSize;
		this.lcdModel=lcdModel;

		this.systemId= String.format("C%03s",idCounter++);
	}

	public String getCpuName(){
		return cpuName;
	}
	public int getRamSize(){
		return ramSize;
	}
	public int getDiskSize(){
		return diskSize;
	}
	public String getSystemId(){
		return systemId;
	}
	public String getLcdModel(){
		return lcdModel;
	}
	public String toString(){
		return String.format("\nSystem Details:\nCPU Name: %s\nRAM Size: %s\nDisk Size: %s\nSystem ID: %s\nLCD Model: %s\n", cpuName, ramSize, diskSize, systemId, lcdModel);
	}
}