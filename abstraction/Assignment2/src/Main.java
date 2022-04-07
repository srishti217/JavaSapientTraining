public class Main {

	public static void main(String[] args) {
		
		BugProject bugProject = new BugProject(null);
		bugProject.setName("BugProject");
		bugProject.setDescription("This is the BugPrject Class");
		
		Bug bug = new Bug();
		bug.setEmail("shrishtigupta@gmail.com");
		bug.setOwner("xyz");
		bug.setStatus(STATUS.ready);
		bug.setPriority(null);
		bug.setProject_id(0);
		bug.setDescription("this is bug description");
		
		System.out.println("Name" +(bugProject.getName()));
		System.out.println("Description" +(bugProject.getDescription()));
		System.out.println("Email" +(bug.getEmail()));
		
		
	
	}

}
