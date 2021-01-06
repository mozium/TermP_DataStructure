import java.util.*;

import javax.xml.soap.Node;
public class KeywordList {
	
	
	private LinkedList<Keyword> lst;
	
	public KeywordList()
	{
		this.lst = new LinkedList<Keyword>();
	}
	
	public void add(Keyword keyword)
	{
		//7. add keyword to proper index base on its count
		if (lst.size() != 0)
		{
			for (int i=0; i<lst.size(); i++)
			{
				Keyword k = lst.get(i);
				if (keyword.count == k.count)
				{
					lst.add(i, keyword);
				}
				else if (keyword.count > k.count)
				{
					lst.addFirst(keyword);
				}
				else
				{
					lst.add(i, keyword);
				}
				break;
			}
		}
		else
		{
			lst.addFirst(keyword);
		}
		// After reading the following pieces of codes, I reckon this is a plain list of keywords.
		// The outputs are only valid, or in other words, transformed after those certain functions.
	}
	
	public void outputIndex(int i)
	{
		if(i>lst.size())
		{
		    System.out.println("InvalidOperation");
		    return;
		}
		
		LinkedList<Keyword> results = new LinkedList<>();
		Keyword k = lst.get(i);		    
		results.add(k);		    		
		
		printKeywordList(results);
		}
		
	public void outputCount(int c)
	{
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i=0; i<lst.size(); i++)
		{
		    Keyword k = lst.get(i);
		    if(k.count == c)
		    {
		    	results.add(k);
		    }
		}
		
		if(results.isEmpty())
		{
		    System.out.println("NotFound");
		}
		else
		{
		    printKeywordList(results);
		}
	}
	
	public void outputHas(String pattern)
	{
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i=0;i<lst.size();i++)
		{
		    Keyword k = lst.get(i);
		    if(k.name.contains(pattern))
		    {
		    	results.add(k);
		    }
		}
		
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}
		else
		{
		    printKeywordList(results);
		}
	}
	
	public void outputName(String pattern){
		
		LinkedList<Keyword> results = new LinkedList<>();
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    if(k.name.equals(pattern)){
		    	results.add(k);
		    }
		}
		if(results.isEmpty()){
		    System.out.println("NotFound");
		}else{
		    printKeywordList(results);
		}
		}
	
	public void outputFirstN(int n){
		if(n>lst.size()){
		    System.out.println("InvalidOperation");
		    return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++){
		    Keyword k = lst.get(i);
		    if(i>0){
		    	sb.append(" ");
		    }
		    sb.append(k.toString());   
		}
		System.out.println(sb.toString());
		
		}
	
	public void outputScore(){
		float results = 0;
		for(int i=0;i<lst.size();i++){
		    Keyword k = lst.get(i);
		    results += k.weight * k.count;
		}
		
		System.out.println(results);
		}
	
	public void deleteIndex(int i)
	{
		if(i>=lst.size())
		{
		    System.out.println("InvalidOperation");
		    return;
		}
			
		lst.remove(i);
		System.out.println("Done");
	}

	public void deleteCount(int cnt)
	{
		// 8. remove nodes that the count is equal to cnt
		int remove_counter = 0;
		for (int i=0; i<lst.size(); i++)
		{
		    Keyword k = lst.get(i);
		    if(k.count == cnt)
		    {
		    	lst.remove(i);
		    	i = 0;
		    	remove_counter ++;
		    }
		}
		
		if(remove_counter == 0)
		{
		    System.out.println("NotFound");
		}
		else
		{
		    System.out.println("Done");
		}
	}

	public void deleteHas(String pattern)
	{
		// 9. remove nodes that the name contains input name
		int remove_counter = 0;
		for (int i=0; i<lst.size(); i++)
		{
		    Keyword k = lst.get(i);
		    if(k.name.contains(pattern))
		    {
		    	lst.remove(i);
		    	i = 0;
		    	remove_counter ++;
		    }
		}
		
		if(remove_counter == 0)
		{
		    System.out.println("NotFound");
		}
		else
		{
		    System.out.println("Done");
		}
	}
	
	public void deleteName(String name)
	{
		// 10. remove nodes that the name is equal to input name
		int remove_counter = 0;
		LinkedList<Keyword> results = new LinkedList<>();
		for (int i=0; i<lst.size(); i++)
		{
		    Keyword k = lst.get(i);
		    if (k.name.contains(name))
		    {
		    	lst.remove(i);
		    	remove_counter += 1;
		    }
		}
		
		if(remove_counter == 0)
		{
		    System.out.println("NotFound");
		}
		else
		{
		    System.out.println("Done");
		}
	}
	
	public void deleteFirstN(int n)
	{
		//11. remove first n nodes
		if(n >= lst.size())
		{
		    System.out.println("InvalidOperation");
		    return;
		}
		else
		{
			for (int i=0; i < n; i++)
			{
			    lst.remove(i);
			}
			System.out.println("Done");
		}
	}
	
	public void deleteAll(){
		lst = new LinkedList<Keyword>();
		System.out.println("Done");
	}
		
		private void printKeywordList(LinkedList<Keyword> kLst){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<kLst.size();i++){
				Keyword k= kLst.get(i);
				if(i>0)sb.append(" ");
				sb.append(k.toString());
			}
			System.out.println(sb.toString());
		}
	}


