class SubtractExpression extends BinaryExpression
{
    public SubtractExpression(final Expression lft, final Expression rht, String operator)
    {
        super(lft, rht, operator );
    }

    @Override
    public double applyOperator(Double lft, Double rht){
        return lft - rht;
    }
}

