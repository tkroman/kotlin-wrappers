// Automatically generated - do not modify!

package typescript

sealed external interface VariableDeclarationList : Node {
    override val kind: SyntaxKind.VariableDeclarationList
    override val parent: dynamic /* VariableStatement | ForStatement | ForOfStatement | ForInStatement */
    val declarations: NodeArray<VariableDeclaration>
}