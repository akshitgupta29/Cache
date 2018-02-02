package com.cache;

import java.util.List;
import java.util.*;

public interface Cache {
	public List<String> readCache(List<String> lst);
	public boolean removeCache(List<String> lst);  
	public boolean insertCache(Map<String, ?> params);
    public boolean updateCache(Map<String, ?> params);
    public void displayCache();  // used to display all cache contents
    public void clearCache();    // All cache contents will be removed
}

