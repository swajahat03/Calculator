class AddExpression extends BinaryExpression
{
    public AddExpression (final Expression lft, final Expression rht)
    {
        super(lft, rht, "+");
    }

    @Override
    public double applyOperator(Double lft, Double rht) {
        return lft + rht;
    }

}
