package tower;

public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        // Call the missing solve method (not this one)
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    private void solveRecursive(int n, int source, int destination, int auxiliary) {
        if (n == 1) {
            model.move(source, destination);
            return;
        }
        solveRecursive(n-1, source, auxiliary, destination);
        model.move(source, destination);
        solveRecursive(n-1, auxiliary, destination, source);
    }
}
