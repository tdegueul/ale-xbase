package converters.lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import prodSys.Machine;
import prodSysTokenHolder.PBindMachine;
import prodSysTokenHolder.ProdSysTokenHolderFactory;
import tokenHolder.P;

public class ListP implements List<P> {
	private final List<Machine> machine;

	public ListP(final List<Machine> machine) {
		this.machine = machine;
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
	public Iterator<P> iterator() {
		final Iterator<Machine> itt = machine.iterator();
		return new Iterator<P>() {

			@Override
			public boolean hasNext() {
				return itt.hasNext();
			}

			@Override
			public P next() {
				final PBindMachine createPBindMachine = ProdSysTokenHolderFactory.eINSTANCE.createPBindMachine();
				createPBindMachine.setDelegate(itt.next());
				return createPBindMachine;
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
	public boolean remove(final Object o) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean containsAll(final Collection<?> c) {
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
	public void add(final int index, final P element) {
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
	public ListIterator<P> listIterator() {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public ListIterator<P> listIterator(final int index) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public List<P> subList(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean add(final P e) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean addAll(final Collection<? extends P> c) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends P> c) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public P get(final int index) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public P set(final int index, final P element) {
		throw new RuntimeException("Not implemented");
	}

	@Override
	public P remove(final int index) {
		throw new RuntimeException("Not implemented");
	}
}