package converters.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import prodSys.Part;
import prodSysTokenHolder.ProdSysTokenHolderFactory;
import prodSysTokenHolder.TBindPart;
import tokenHolder.T;

public class ListT implements List<T> {
	private final List<Part> parts;

	public ListT(List<Part> parts) {
		this.parts = parts;
	}

	@Override
	public int size() {
		return parts.size();
	}

	@Override
	public boolean isEmpty() {
		return parts.isEmpty();
	}

	@Override
	public boolean contains(final Object o) {
		return parts.contains(o);
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		throw new RuntimeException("Not implemented");
		// return null;
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean add(final T e) {
		if (e instanceof TBindPart) {
			return parts.add(((TBindPart) e).getDelegate());
		}
		// return parts.add();
		return false;
	}

	@Override
	public boolean remove(final Object o) {
		return parts.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean addAll(final Collection<? extends T> c) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends T> c) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public T get(final int index) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public T set(final int index, final T element) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public void add(final int index, final T element) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public T remove(final int index) {
		final TBindPart ret = ProdSysTokenHolderFactory.eINSTANCE.createTBindPart();
		ret.setDelegate(parts.remove(index));
		return ret;
	}

	@Override
	public int indexOf(final Object o) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public int lastIndexOf(final Object o) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public ListIterator<T> listIterator() {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public ListIterator<T> listIterator(final int index) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public List<T> subList(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Not implemented");
	}
}