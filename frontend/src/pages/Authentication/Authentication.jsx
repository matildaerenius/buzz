import { Card, Grid } from '@mui/material'
import React from 'react'
import Login from './Login'

const Authentication = () => {
    return (
        <div>
            <Grid container>
                <Grid className='h-screen overflow-hidden' item xs={7}>
                    <img className='h-full w-full' src="https://images.pexels.com/photos/853168/pexels-photo-853168.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="" />
                </Grid>
                <Grid item xs={5}>

                <div className='px-20 flex flex-col justify-center h-full'>

                    <Card className='card p-8'>

                        <div className='flex flex-col items-center mb-5 space-y-1'>
                        <h1 className='logo text-center'>Buzz</h1>
                        <p className='text-center text-sm w-[70&]'>Share stories: Your Social World, Your way</p>
                        </div>

                        <Login/>

                    </Card>

                </div>

                </Grid>
            </Grid>
        </div>
    )
}

export default Authentication