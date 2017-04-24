package ale.compiler.ui.popup.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class GenerateRevisitorInterface implements IObjectActionDelegate {

	private Shell shell;
	private IFile selectedIFile;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateRevisitorInterface() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		new ale.compiler.AleRevisitorInterfaceCompiler(this.selectedIFile).compile();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection != null & selection instanceof IStructuredSelection) {
			final StructuredSelection ss = (StructuredSelection) selection;
			final Object o = ss.getFirstElement();
			if (o instanceof IFile) {
				selectedIFile = (IFile) o;
			}
			if (o instanceof IAdaptable) {
				final IFile res = (IFile) ((IAdaptable) o).getAdapter(IFile.class);
				if (res != null) {
					selectedIFile = res;
				}
			}
		}
	}

}
