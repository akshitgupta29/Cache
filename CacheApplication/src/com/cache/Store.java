//InternfaceName obj = new ClassName();
package com.cache;
import java.util.List;

public interface Store 
{
	public boolean openconnection();
	public boolean insert (String key, String value);
	public List<String> read(List<String> key);
	public boolean update (String key, String value);
	public boolean remove (List<String> key);
	public void closeConnection();
}
