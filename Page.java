
public class Page {
private  Page[] inLinks;
private int inLinksNum;
private int outLinks;
private int id;
//private Page[] outLinks;
private double rank;
public Page(int ide,int n)
{
	rank=10;
	inLinksNum=0;
	inLinks=new Page[100];
	outLinks=0;
	id=ide;
}
public void AddInLinks(Page link)
{
	inLinks[inLinksNum]=link;
	inLinksNum++;
}
public void setOutLinks(int n)
{
	outLinks=n;
}
public Page[] getInLinks()
{
	return inLinks;
}

public int getOutLinks()
{
	return outLinks;
}
public double getRank()
{
	return rank;
}
public void setRank(double r)
{
	rank=r;
}
public int getId()
{
	return id;
}
public int getInLinkNum()
{
	return inLinksNum;
}
}
