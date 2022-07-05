package sample;

public abstract class Characters
{
    // Instance var
    private String name;
    private int gender;
    private int season;
    private int hobby;

    // Full constructor
    public Characters(String name, int gender, int season, int hobby)
    {
        this.name = name;
        this.gender = gender;
        this. season = season;
        this.hobby = hobby;
    }

    // Getters and Setters
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGender()
    {
        return this.gender;
    }

    public void setGender(int gender)
    {
        this.gender = gender;
    }

    public int getSeason()
    {
        return this.season;
    }

    public void setSeason(int Season)
    {
        this.season = season;
    }

    public int getHobby()
    {
        return this.hobby;
    }

    public void setHobby(int hobby)
    {
        this.hobby = hobby;
    }

    // connect code to the controller


    // Override mrthod
    /*
    @Override
    public String toString()
    {
        return "GameCharacter: name[" + this.name + "], characterClass[" + this.characterClass + "}, gold[" + this.gold + "], hitPoints[" + this.hitPoints + "]";
    }

    @Override
    public boolean equals(Object other)
    {
        if(other == null || this.getClass() != other.getClass())
        {
            return false;
        }

        GameCharacter gc = (GameCharacter) other;
        return this.name.equals(gc.getName()) && this.characterClass.equals(gc.getCharacterClass()) && this.alignment.equals(gc.getAlignment()) && this.gold == gc.getGold() && this.expPoints == gc.getExpPoints() && this.hitPoints == gc.getHitPoints() && this.armorClass == gc.getArmorClass() && this.weapon1 == gc.getWeapon1() &&
                this.weapon2 == gc.getWeapon2();
    }

    // Abstract Methods
    public abstract void assist(GameCharacter gc);
    public abstract boolean attack(GameCharacter gc);
     */

}
