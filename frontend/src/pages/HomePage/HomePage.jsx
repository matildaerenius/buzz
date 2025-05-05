import { Grid } from "@mui/material";
import React from "react";

import { Route, Routes } from "react-router-dom";
import MiddlePart from "../../components/MiddlePart/MiddlePart";
import CreateReelsForm from "../../components/Reels/CreateReelsForm";
import Reels from "../../components/Reels/Reels";
import Profile from "../Profile/Profile";
import HomeRight from "../../components/HomeRight/HomeRight";
import Sidebar from "../../components/Sidebar/Sidebar";

export const HomePage = () => {
  // const location = useLocation();
  return (
    <div className="px-20 h-screen">
      <Grid container wrap="nowrap" spacing={0} sx={{ height: "100%" }}>
        <Grid
          item
          xs={false}
          md={3}
          sx={{ display: { xs: "none", md: "block" } }}
        >
          <div className="sticky top-0 h-screen">
            <Sidebar />
          </div>
        </Grid>
        <Grid
          item
          xs={12}
          md={6}
          sx={{
            minWidth: 0,
            overflowY: "auto",
            height: "100%",
            px: 2,
          }}
        >
          <Routes>
            <Route path="/" element={<MiddlePart />} />
            <Route path="/reels" element={<Reels />} />
            <Route path="/create-reels" element={<CreateReelsForm />} />
            <Route path="/profile/:id" element={<Profile />} />
          </Routes>
        </Grid>
        <Grid
          item
          xs={false}
          md={3}
          sx={{ display: { xs: "none", md: "block" } }}
        >
          <div className="sticky top-0 h-screen">
            <HomeRight />
          </div>
        </Grid>
      </Grid>
    </div>
  );
};
export default HomePage;
