package fr.treeptik.initjava;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MultiMap extends AbstractMap<String, String> {

	HashMap<String, List<String>> map = new HashMap<>();

	public String put(String key, String value) {

		if (map.containsKey(key)) {
			map.get(key).add(value);

		} else {
			ArrayList<String> list = new ArrayList<>();
			list.add(value);

			map.put(key, list);
		}

		return null;
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {

		return null;
	}

}
