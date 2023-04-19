package Day8.Example;
import java.io.FilePermission;
import java.security.PermissionCollection;
public class Vidu2 {

	public static void main(String[] args) {
		String srg = "D:\\TKW\\Batch176\\Java-II\\src\\Day8\\Example";
        
        // Cấp quyền read cho path1
        FilePermission file1 = new FilePermission("D:\\TKW\\Batch176\\Java-II\\src\\Day8\\Example\\Java.txt\\-", "read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
         
        // Cấp quyền write cho path2
        FilePermission file2 = new FilePermission(srg, "write");
        permission.add(file2);
         
        if (permission.implies(new FilePermission(srg, "read,write"))) {
            System.out.println("Read, Write permission is granted for the path " + srg);
        } else {
            System.out.println("No Read, Write permission is granted for the path " + srg);
        }
	}

}
