package com.training.ifaces;

import java.util.List;

public interface MyDAO<T> {
	
	public int add(T t);
	public T find(int key);
	public List<T> findAll();
	public T update(String key, String newkey);
	public int delete(String key);

}
