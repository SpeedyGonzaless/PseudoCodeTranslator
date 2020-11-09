import org.antlr.v4.runtime.tree.ParseTree;

public class TreeToPython {

	private ParseTree tree;
	private String code = "";
	private int tabCounter = 0;

	public TreeToPython(ParseTree tree) {
		this.tree = tree;
	}

	public void translate() {
		dfsWalk(tree);
	}

	private void dfsWalk(ParseTree subTree) {
		for (int i=0; i<subTree.getChildCount(); i++) {
			dfsWalk(subTree.getChild(i));
		}
	}
}
