package main;
/**
 * @author Aleksander.
 * edited by Emil
 * This class holds the responsibility to manage the rules of the game.
 */
public class Rule {
	
	/**
	 * Rule for Werewall (Used for eksta turn)
	 * @param shaker
	 * @return
	 */
	boolean ruleWolf(Shaker shaker)
	{
		if (shaker.getShake() == 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Rule used for determining the winner
	 * @param player
	 * @return
	 */
	boolean winner(Player player)
		{
		if(player.getAccount().getBalance() >= 3000)
		{
			return true;
		}
			return false;
		}
}