/**
 * 
 */
package gurpssheet;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jwalker
 *
 */
@Entity
@Table(name = "gurps_character")
public class GurpsCharacter {
	@Column(name = "age")
	String age;
	@Column(name = "basic_fp")
	int basicFP;
	@Column(name = "basic_hp")
	int basicHP;
	@Column(name = "basic_lift")
	int basicLift;
	@Column(name = "basic_move")
	int basicMove;
	@Column(name = "basic_speed")
	int basicSpeed;
	@Column(name = "birthday")
	String birthday;
	@Column(name = "campaign")
	String campaign;
	@Column(name = "carry_on_back")
	int carryOnBack;
	@Column(name = "check_1")
	int check1;
	@Column(name = "check_2")
	int check2;
	@Column(name = "check_3")
	int check3;
	@Column(name = "check_4")
	int check4;
	@Column(name = "collapse_fp")
	int collapseFP;
	@Column(name = "created_on")
	Date createdOn;
	@Column(name = "currebt_fp")
	int currentFP;
	@Column(name = "current_hp")
	int currentHP;
	@Column(name = "dead")
	int dead;
	@Column(name = "dx")
	int dx;
	@Column(name = "encumbrance")
	int encumbrance;
	@Column(name = "eye_dr")
	int eyeDR;
	@Column(name = "eyes")
	String eyes;
	@Column(name = "face_dr")
	int faceDR;
	@Column(name = "foot_dr")
	int footDR;
	@Column(name = "fright_check")
	int frightCheck;
	@Column(name = "gender")
	String gender;
	@Column(name = "groin_dr")
	int groinDR;
	@Column(name = "hair")
	String hair;
	@Column(name = "hand")
	String hand;
	@Column(name = "hand_dr")
	int handDR;
	@Column(name = "hearing")
	int hearing;
	@Column(name = "heavy_enc_dodge")
	int heavyEncDodge;
	@Column(name = "heavy_enc_load")
	int heavyEncLoad;
	@Column(name = "heavy_enc_move")
	int heavyEncMove;
	@Column(name = "ht")
	int ht;

	@Id
	@GeneratedValue
	int id;
	@Column(name = "iq")
	int iq;
	@Column(name = "left_arm_dr")
	int leftArmDR;

	@Column(name = "left_leg_dr")
	int leftLegDR;
	@Column(name = "light_enc_dodge")
	int lightEncDodge;
	@Column(name = "light_enc_load")
	int lightEncLoad;

	@Column(name = "light_enc_move")
	int lightEncMove;
	@Column(name = "med_enc_dodge")
	int medEncDodge;
	@Column(name = "med_enc_load")
	int medEncLoad;

	@Column(name = "med_enc_move")
	int medEncMove;
	@Column(name = "name")
	String name;
	@Column(name = "neck_dr")
	int neckDR;

	@Column(name = "no_enc_dodge")
	int noEncDodge;

	@Column(name = "no_enc_load")
	int noEncLoad;

	@Column(name = "no_enc_move")
	int noEncMove;

	@Column(name = "one_hand_lift")
	int oneHandLift;

	@Column(name = "perception")
	int perception;

	@Column(name = "player")
	String player;

	@Column(name = "race")
	String race;

	@Column(name = "reeling")
	int reeling;

	@Column(name = "religion")
	String religion;

	@Column(name = "right_arm_dr")
	int rightArmDR;

	@Column(name = "right_leg_dr")
	int rightLegDR;

	@Column(name = "run_shove_knock_over")
	int runShoveKnockOver;

	@Column(name = "shift_slightly")
	int shiftSlightly;

	@Column(name = "shove_knock_over")
	int shoveKnockOver;

	@Column(name = "size")
	int size;

	@Column(name = "skin")
	String skin;

	@Column(name = "skull_dr")
	int skullDR;

	@Column(name = "st")
	int st;

	@Column(name = "taste_smell")
	int tasteSmell;

	@Column(name = "tired")
	int tired;

	@Column(name = "title")
	String title;

	@Column(name = "tl")
	int tl;

	@Column(name = "torso_dr")
	int torsoDR;

	@Column(name = "touch")
	int touch;

	@Column(name = "two_hand_lift")
	int twoHandLift;

	@Column(name = "unconscious")
	int unconscious;

	@Column(name = "vision")
	int visionn;

	@Column(name = "vitals_dr")
	int vitalsDR;

	@Column(name = "weight")
	String weight;

	@Column(name = "will")
	int will;

	@Column(name = "xheavy_enc_dodge")
	int xheavyEncDodge;

	@Column(name = "xheavy_enc_load")
	int xheavyEncLoad;

	@Column(name = "xheavy_enc_move")
	int xheavyEncMove;

	@Column(name = "swing_dice")
	int swingDice;
	
	@Column(name = "swing_mod")
	int swingMod;

	@Column(name = "thrust_dice")
	int thrustDice;
	
	@Column(name = "thrust_mod")
	int thrustMod;

	
	public String getAge() {
		return age;
	}

	public int getBasicFP() {
		return basicFP;
	}

	public int getBasicHP() {
		return basicHP;
	}

	public int getBasicLift() {
		return basicLift;
	}

	public int getBasicMove() {
		return basicMove;
	}

	public int getBasicSpeed() {
		return basicSpeed;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getCampaign() {
		return campaign;
	}

	public int getCarryOnBack() {
		return carryOnBack;
	}

	public int getCheck1() {
		return check1;
	}

	public int getCheck2() {
		return check2;
	}

	public int getCheck3() {
		return check3;
	}

	public int getCheck4() {
		return check4;
	}

	public int getCollapseFP() {
		return collapseFP;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public int getCurrentFP() {
		return currentFP;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public int getDead() {
		return dead;
	}

	public int getDx() {
		return dx;
	}

	public int getEncumbrance() {
		return encumbrance;
	}

	public int getEyeDR() {
		return eyeDR;
	}

	public String getEyes() {
		return eyes;
	}

	public int getFaceDR() {
		return faceDR;
	}

	public int getFootDR() {
		return footDR;
	}

	public int getFrightCheck() {
		return frightCheck;
	}

	public String getGender() {
		return gender;
	}

	public int getGroinDR() {
		return groinDR;
	}

	public String getHair() {
		return hair;
	}

	public String getHand() {
		return hand;
	}

	public int getHandDR() {
		return handDR;
	}

	public int getHearing() {
		return hearing;
	}

	public int getHeavyEncDodge() {
		return heavyEncDodge;
	}

	public int getHeavyEncLoad() {
		return heavyEncLoad;
	}

	public int getHeavyEncMove() {
		return heavyEncMove;
	}

	public int getHt() {
		return ht;
	}

	public int getId() {
		return id;
	}

	public int getIq() {
		return iq;
	}

	public int getLeftArmDR() {
		return leftArmDR;
	}

	public int getLeftLegDR() {
		return leftLegDR;
	}

	public int getLightEncDodge() {
		return lightEncDodge;
	}

	public int getLightEncLoad() {
		return lightEncLoad;
	}

	public int getLightEncMove() {
		return lightEncMove;
	}

	public int getMedEncDodge() {
		return medEncDodge;
	}

	public int getMedEncLoad() {
		return medEncLoad;
	}

	public int getMedEncMove() {
		return medEncMove;
	}

	public String getName() {
		return name;
	}

	public int getNeckDR() {
		return neckDR;
	}

	public int getNoEncDodge() {
		return noEncDodge;
	}

	public int getNoEncLoad() {
		return noEncLoad;
	}

	public int getNoEncMove() {
		return noEncMove;
	}

	public int getOneHandLift() {
		return oneHandLift;
	}

	public int getPerception() {
		return perception;
	}

	public String getPlayer() {
		return player;
	}

	public String getRace() {
		return race;
	}

	public int getReeling() {
		return reeling;
	}

	public String getReligion() {
		return religion;
	}

	public int getRightArmDR() {
		return rightArmDR;
	}

	public int getRightLegDR() {
		return rightLegDR;
	}

	public int getRunShoveKnockOver() {
		return runShoveKnockOver;
	}

	public int getShiftSlightly() {
		return shiftSlightly;
	}

	public int getShoveKnockOver() {
		return shoveKnockOver;
	}

	public int getSize() {
		return size;
	}

	public String getSkin() {
		return skin;
	}

	public int getSkullDR() {
		return skullDR;
	}

	public int getSt() {
		return st;
	}

	public int getTasteSmell() {
		return tasteSmell;
	}

	public int getTired() {
		return tired;
	}

	public String getTitle() {
		return title;
	}

	public int getTl() {
		return tl;
	}

	public int getTorsoDR() {
		return torsoDR;
	}

	public int getTouch() {
		return touch;
	}

	public int getTwoHandLift() {
		return twoHandLift;
	}

	public int getUnconscious() {
		return unconscious;
	}

	public int getVisionn() {
		return visionn;
	}

	public int getVitalsDR() {
		return vitalsDR;
	}

	public String getWeight() {
		return weight;
	}

	public int getWill() {
		return will;
	}

	public int getXheavyEncDodge() {
		return xheavyEncDodge;
	}

	public int getXheavyEncLoad() {
		return xheavyEncLoad;
	}

	public int getXheavyEncMove() {
		return xheavyEncMove;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setBasicFP(int basicFP) {
		this.basicFP = basicFP;
	}

	public void setBasicHP(int basicHP) {
		this.basicHP = basicHP;
	}

	public void setBasicLift(int basicLift) {
		this.basicLift = basicLift;
	}

	public void setBasicMove(int basicMove) {
		this.basicMove = basicMove;
	}

	public void setBasicSpeed(int basicSpeed) {
		this.basicSpeed = basicSpeed;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public void setCarryOnBack(int carryOnBack) {
		this.carryOnBack = carryOnBack;
	}

	public void setCheck1(int check1) {
		this.check1 = check1;
	}

	public void setCheck2(int check2) {
		this.check2 = check2;
	}

	public void setCheck3(int check3) {
		this.check3 = check3;
	}

	public void setCheck4(int check4) {
		this.check4 = check4;
	}

	public void setCollapseFP(int collapseFP) {
		this.collapseFP = collapseFP;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public void setCurrentFP(int currentFP) {
		this.currentFP = currentFP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public void setDead(int dead) {
		this.dead = dead;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public void setEncumbrance(int encumbrance) {
		this.encumbrance = encumbrance;
	}

	public void setEyeDR(int eyeDR) {
		this.eyeDR = eyeDR;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public void setFaceDR(int faceDR) {
		this.faceDR = faceDR;
	}

	public void setFootDR(int footDR) {
		this.footDR = footDR;
	}

	public void setFrightCheck(int frightCheck) {
		this.frightCheck = frightCheck;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setGroinDR(int groinDR) {
		this.groinDR = groinDR;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public void setHandDR(int handDR) {
		this.handDR = handDR;
	}

	public void setHearing(int hearing) {
		this.hearing = hearing;
	}

	public void setHeavyEncDodge(int heavyEncDodge) {
		this.heavyEncDodge = heavyEncDodge;
	}

	public void setHeavyEncLoad(int heavyEncLoad) {
		this.heavyEncLoad = heavyEncLoad;
	}

	public void setHeavyEncMove(int heavyEncMove) {
		this.heavyEncMove = heavyEncMove;
	}

	public void setHt(int ht) {
		this.ht = ht;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public void setLeftArmDR(int leftArmDR) {
		this.leftArmDR = leftArmDR;
	}

	public void setLeftLegDR(int leftLegDR) {
		this.leftLegDR = leftLegDR;
	}

	public void setLightEncDodge(int lightEncDodge) {
		this.lightEncDodge = lightEncDodge;
	}

	public void setLightEncLoad(int lightEncLoad) {
		this.lightEncLoad = lightEncLoad;
	}

	public void setLightEncMove(int lightEncMove) {
		this.lightEncMove = lightEncMove;
	}

	public void setMedEncDodge(int medEncDodge) {
		this.medEncDodge = medEncDodge;
	}

	public void setMedEncLoad(int medEncLoad) {
		this.medEncLoad = medEncLoad;
	}

	public void setMedEncMove(int medEncMove) {
		this.medEncMove = medEncMove;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNeckDR(int neckDR) {
		this.neckDR = neckDR;
	}

	public void setNoEncDodge(int noEncDodge) {
		this.noEncDodge = noEncDodge;
	}

	public void setNoEncLoad(int noEncLoad) {
		this.noEncLoad = noEncLoad;
	}

	public void setNoEncMove(int noEncMove) {
		this.noEncMove = noEncMove;
	}

	public void setOneHandLift(int oneHandLift) {
		this.oneHandLift = oneHandLift;
	}

	public void setPerception(int perception) {
		this.perception = perception;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void setReeling(int reeling) {
		this.reeling = reeling;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void setRightArmDR(int rightArmDR) {
		this.rightArmDR = rightArmDR;
	}

	public void setRightLegDR(int rightLegDR) {
		this.rightLegDR = rightLegDR;
	}

	public void setRunShoveKnockOver(int runShoveKnockOver) {
		this.runShoveKnockOver = runShoveKnockOver;
	}

	public void setShiftSlightly(int shiftSlightly) {
		this.shiftSlightly = shiftSlightly;
	}

	public void setShoveKnockOver(int shoveKnockOver) {
		this.shoveKnockOver = shoveKnockOver;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public void setSkullDR(int skullDR) {
		this.skullDR = skullDR;
	}

	public void setSt(int st) {
		this.st = st;
	}

	public void setTasteSmell(int tasteSmell) {
		this.tasteSmell = tasteSmell;
	}

	public void setTired(int tired) {
		this.tired = tired;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTl(int tl) {
		this.tl = tl;
	}

	public void setTorsoDR(int torsoDR) {
		this.torsoDR = torsoDR;
	}

	public void setTouch(int touch) {
		this.touch = touch;
	}

	public void setTwoHandLift(int twoHandLift) {
		this.twoHandLift = twoHandLift;
	}

	public void setUnconscious(int unconscious) {
		this.unconscious = unconscious;
	}

	public void setVisionn(int visionn) {
		this.visionn = visionn;
	}

	public void setVitalsDR(int vitalsDR) {
		this.vitalsDR = vitalsDR;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setWill(int will) {
		this.will = will;
	}

	public void setXheavyEncDodge(int xheavyEncDodge) {
		this.xheavyEncDodge = xheavyEncDodge;
	}

	public void setXheavyEncLoad(int xheavyEncLoad) {
		this.xheavyEncLoad = xheavyEncLoad;
	}

	public void setXheavyEncMove(int xheavyEncMove) {
		this.xheavyEncMove = xheavyEncMove;
	}

}
