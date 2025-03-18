public class Lab{

	private String name;
	private Employee labStaff;
	private boolean hasMultimedia;
	private SystemUnit system[]=new SystemUnit[50];

	Lab(String name,Employee labStaff,boolean hasMultimedia, SystemUnit system[]) {
		this.name=name;
		this.labStaff.setName(labStaff.getName());
		this.labStaff.setDesignation(labStaff.getDesignation());
		this.hasMultimedia=hasMultimedia;
		
	
		for(int i=0; i<system.length;i++){
			this.system[i] = new SystemUnit(system[i].getCpuName(),system[i].getRamSize(),system[i].getDiskSize(),system[i].getSystemId(),system[i].getLcdModel());
		}
	}

	public String getName(){
		return name;
	}
	public Employee getLabStaff(){
		return labStaff;
	}
	public SystemUnit[] getSystems(){
		return system;
	}
	public boolean getHasMultimedia(){
		return hasMultimedia;
	}

	public String toString(){

		String s;

		StringBuilder sb = new StringBuilder();

		sb.append("LAB NAME: ").append(name).append("\nHas MultiMedia: ").append(hasMultimedia).append("\nLab Incharge: ").append(this.labStaff.getName()).append("\nSYSTEM DETAILS; \n");

		for (int i=0; i<system.length; i++){

			sb.append(system[i].toString()).append("\n");

		}

		s = sb.toString();

		return s;

	}

	
}