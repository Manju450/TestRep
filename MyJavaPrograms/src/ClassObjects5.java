//import java.io.*;

public class ClassObjects5 {
	
	public static void main(String[] args) throws Exception {
        //int n,i,j;
        //String privilegeDetails,privilage[];
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
    }
    
	
	

}


class RoleBO {
    
    public void displayRoleDetails(Role[] role)
    {
        //fill code here.
    }
    
}


class Role {
    private String name;
    private String description;
    private Privilege[] privilege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Privilege[] getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege[] privilege) {
        this.privilege = privilege;
    }
    
}


class Privilege {
    String name;

    public Privilege() {
    }

    public Privilege(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

