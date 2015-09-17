package accesscontrol;
import static net.mindview.util.Print.*;
public class Exercise8 {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++){
			ConnectionManager.getConnection();
		}
		Connection c = ConnectionManager.getConnection();
		if(c == null){
			print("No More connections");
		}

	}

}

class ConnectionManager
{
	private static int counter = 0;
	private static int count = 5;
	private static Connection[] connections = new Connection[count];
	{
		for(int i= 0; i<count; i++){
			
			connections[i] = Connection.getConnection();
		}
		
	}
	
	public static Connection getConnection(){
		Connection c= null;
		if (counter<count){
			
			print("Connection No:"+(counter+1));
			
			c = connections[counter];
			counter++;
		}
		return c;
	}
	
	
	
}

class Connection
{
	private static int counter = 5;
	private static int count = 0;
	private Connection()
	{
		
	}
	
	public static Connection getConnection()
	{
		if (count<counter){
			count++;
			return new Connection();
		}
		return null;
	}
}


