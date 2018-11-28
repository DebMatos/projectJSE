package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class EntityRepository<T extends Entity> {

	private Map<Long, T> map = new HashMap<Long, T>();

	private long actualId = 1;

	public void save(T entidade) {
		entidade.setId(actualId);
		map.put(entidade.getId(), entidade);

		actualId++;

	}

	public T findById(Long id) {
		return map.get(id);
	}

	public void removeById(Long id) {

		map.remove(id);
	}

	public void updateById(T entidade) {

		map.replace(entidade.getId(), entidade);

	}

	public Iterator<T> getAll() {
		return map.values().iterator();
	}

	
	public void size(){
		map.size();
	
	}
	
	public boolean isEmpty() {
		if (map.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
