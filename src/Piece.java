
public class Piece {

	String name;
	boolean onestep; // For King
	boolean forward; // For Pawn
	boolean line; // For Rook
	boolean diagonal; // For Bishop
	boolean unusual; // For Knight
	// For Queen - line,diagonal
	boolean alive;
	int type; // white or black

	public Piece()
	{
		name = "null";
		// row and col does not exists
		alive = false;
		type = 0;
	}
	
	public Piece(Piece piece) {
		// TODO Auto-generated constructor stub
		name = piece.name;
		onestep = piece.onestep;
		forward = piece.forward;
		line = piece.line;
		diagonal = piece.diagonal;
		unusual = piece.unusual;
		alive = piece.alive;
		type = piece.type;
		
	}

	void reset()
	{
		name = "null";
		// row and col does not exists
		onestep = forward = line = diagonal = unusual = false;
		alive = false;
		type = 0;
	}
	
	void setAlive(boolean alive)
	{
		this.alive = alive;
	}
	
	void setType(int type)
	{
		this.type = type;
	}
	
	String getTypeName()
	{
		String tname = "";
		if(type==1) tname = "White";
		if(type==-1) tname = "Black";
		if(type==0) tname = "No Type";
		
		/*
		tname = (type==1)? "White" : "Black";
		if(type==0)
			tname="No Type";
		*/
		return tname;
	}
	String getName()
	{
		return this.name;
	}
	
	int getType()
	{
		return this.type;
	}
	
	int getOppType()
	{
		return -this.type;
	}
	
	void setParameter(String name,boolean onestep,boolean forward,boolean line,boolean diagonal,boolean unusual)
	{
		this.name = name;
		this.onestep = onestep;
		this.forward = forward;
		this.line = line;
		this.diagonal = diagonal;
		this.unusual = unusual;
	}
}
