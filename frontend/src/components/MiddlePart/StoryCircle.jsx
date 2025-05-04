import { Avatar } from "@mui/material";
import React from "react";

export const StoryCircle = () => {
  return (
    <div>
      <div className="flex flex-col items-center mr-4 cursor-pointer">
        <Avatar
          sx={{ width: "5rem", height: "5rem" }}
          src="https://cdn.pixabay.com/photo/2020/05/24/05/36/woman-5212479_1280.png"
        ></Avatar>
        <p>username</p>
      </div>
    </div>
  );
};
export default StoryCircle;
