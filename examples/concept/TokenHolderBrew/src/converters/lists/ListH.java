package converters.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import prodSys.Conveyor;
import prodSysTokenHolder.HBindConveyor;
import prodSysTokenHolder.ProdSysTokenHolderFactory;
import tokenHolder.H;

public class ListH implements List<H> {

	private final List<Conveyor> inC;

	public ListH(final List<Conveyor> inC) {
		this.inC = inC;
	}

	@Override
	public int size() {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public boolean contains(final Object o) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public Iterator<H> iterator() {

		final Iterator<Conveyor> itt = this.inC.iterator();
		return new Iterator<H>() {

			@Override
			public boolean hasNext() {

				return itt.hasNext();
			}

			@Override
			public H next() {
				final HBindConveyor createHBindConveyor = ProdSysTokenHolderFactory.eINSTANCE.createHBindConveyor();
				createHBindConveyor.setDelegate(itt.next());
				return createHBindConveyor;
			}
		};

	}

	@Override
	public Object[] toArray() {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public <T> T[] toArray(final T[] a) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public boolean add(final H e) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public boolean remove(final Object o) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public boolean containsAll(final Collection<?> c) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public boolean addAll(final Collection<? extends H> c) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public boolean addAll(final int index, final Collection<? extends H> c) {
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
	public H get(final int index) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public H set(final int index, final H element) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public void add(final int index, final H element) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public H remove(final int index) {
		throw new RuntimeException("Not implemented");

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
	public ListIterator<H> listIterator() {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public ListIterator<H> listIterator(final int index) {
		throw new RuntimeException("Not implemented");

	}

	@Override
	public List<H> subList(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Not implemented");

	}

}
