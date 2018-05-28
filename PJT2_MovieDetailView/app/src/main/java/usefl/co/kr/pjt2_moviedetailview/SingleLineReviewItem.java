package usefl.co.kr.pjt2_moviedetailview;

public class SingleLineReviewItem {
    String profileImage;
    String nickName;
    String regDate;
    String rating;
    String suggest;

    public SingleLineReviewItem(String profileImage, String nickName, String regDate, String rating, String suggest) {
        this.profileImage = profileImage;
        this.nickName = nickName;
        this.regDate = regDate;
        this.rating = rating;
        this.suggest = suggest;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    @Override
    public String toString() {
        return "SingleLineReviewItem{" +
                "profileImage='" + profileImage + '\'' +
                ", nickName='" + nickName + '\'' +
                ", regDate='" + regDate + '\'' +
                ", rating='" + rating + '\'' +
                ", suggest='" + suggest + '\'' +
                '}';
    }
}
