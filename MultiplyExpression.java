class MultiplyExpression extends BinaryExpression
{
    public MultiplyExpression(final Expression lft, final Expression rht, String operator)
    {
        super(lft, rht, operator);
    }

    @Override
    public double applyOperator(Double lft, Double rht){
        return lft * rht;
    }

}

