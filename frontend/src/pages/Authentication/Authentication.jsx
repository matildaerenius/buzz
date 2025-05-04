import { Box, Card, Grid } from "@mui/material";
import React from "react";
import Login from "./Login";
import Register from "./Register";
import { Route, Routes } from "react-router-dom";

const bgUrl =
  "https://images.pexels.com/photos/1111367/pexels-photo-1111367.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1";

export const Authentication = () => (
  <Box
    sx={{
      position: "relative",
      height: "100vh",
      width: "100%",
      backgroundImage: `url(${bgUrl})`,
      backgroundSize: "cover",
      backgroundPosition: "center",
    }}
  >
    <Box
      sx={{
        position: "absolute",
        top: "50%",
        right: { xs: "5%", sm: "10%", md: "15%" },
        transform: "translateY(-50%)",
        width: { xs: "90%", sm: 360 },
      }}
    >
      <Card sx={{ p: 4 }}>
        <Box textAlign="center" mb={2}>
          <h1 className="logo">Buzz</h1>
          <p>Join the Buzz — Connect, Share, Enjoy</p>
        </Box>

        <Routes>
          <Route path="/" element={<Login />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
        </Routes>
      </Card>
    </Box>
  </Box>
);

export default Authentication;
