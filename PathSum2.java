public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root == null)
			return res;
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		recursion(root, res, tmp, sum);
		tmp = null;
		return res;
    }
    public void recursion(TreeNode root, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, int sum)
	{
		if(root.left == null && root.right == null)
		{
			tmp.add(root.val);
			int sum1 = 0;
			for(int i = 0; i < tmp.size(); i++)
			{
				sum1 += tmp.get(i);
			}
			if(sum1 == sum)
				res.add(new ArrayList<Integer>(tmp));
			return ;
		}
		tmp.add(root.val);
		if(root.left != null)
		{	
			recursion(root.left, res, tmp, sum);
			tmp.remove(tmp.size() - 1);
		}
		if(root.right != null)
		{
			recursion(root.right, res, tmp, sum);
			tmp.remove(tmp.size() - 1);
		}
	}
}