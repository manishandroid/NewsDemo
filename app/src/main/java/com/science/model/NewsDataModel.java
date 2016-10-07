package com.science.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;

public class NewsDataModel {

    @Expose
    private Integer CategoryId;
    @Expose
    private String CategoryName;
    @Expose
    private String ImageUrl;
    @Expose
    private List<Subcategory> Subcategories = new ArrayList<Subcategory>();

    /**
     * @return The CategoryId
     */
    public Integer getCategoryId() {
        return CategoryId;
    }

    /**
     * @param CategoryId The CategoryId
     */
    public void setCategoryId(Integer CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * @return The CategoryName
     */
    public String getCategoryName() {
        return CategoryName;
    }

    /**
     * @param CategoryName The CategoryName
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * @return The ImageUrl
     */
    public String getImageUrl() {
        return ImageUrl;
    }

    /**
     * @param ImageUrl The ImageUrl
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * @return The Subcategories
     */
    public List<Subcategory> getSubcategories() {
        return Subcategories;
    }

    /**
     * @param Subcategories The Subcategories
     */
    public void setSubcategories(List<Subcategory> Subcategories) {
        this.Subcategories = Subcategories;
    }


    public class Subcategory {

        @Expose
        private Integer subCategoryId;
        @Expose
        private String subCategoryName;
        @Expose
        private String ImageUrl;
        @Expose
        private String description;

        /**
         * @return The subCategoryId
         */
        public Integer getSubCategoryId() {
            return subCategoryId;
        }

        /**
         * @param subCategoryId The subCategoryId
         */
        public void setSubCategoryId(Integer subCategoryId) {
            this.subCategoryId = subCategoryId;
        }

        /**
         * @return The subCategoryName
         */
        public String getSubCategoryName() {
            return subCategoryName;
        }

        /**
         * @param subCategoryName The subCategoryName
         */
        public void setSubCategoryName(String subCategoryName) {
            this.subCategoryName = subCategoryName;
        }

        /**
         * @return The ImageUrl
         */
        public String getImageUrl() {
            return ImageUrl;
        }

        /**
         * @param ImageUrl The ImageUrl
         */
        public void setImageUrl(String ImageUrl) {
            this.ImageUrl = ImageUrl;
        }

        /**
         * @return The description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

    }
}
